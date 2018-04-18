var express = require('express');
var app = express();
var request = require('request');
var bodyParser = require("body-parser");

app.use(bodyParser.urlencoded({ extended: false }));
app.use(bodyParser.json());

app.get('/', function (req, res) {
        res.send('Hello World!');
});

var convertJsonToUrl = function (object) {
        return Object.keys(object).map(function (key) {
                return encodeURIComponent(key) + '=' + encodeURIComponent(object[key]);
        }).join('&');
}
var req = {
        post: function (url, body, callbackSuccess, callbackError) {
                request.post(url + "?" + convertJsonToUrl(body), body,
                        function (error, response, bodyReturn) {
                                (!error && response.statusCode == 200) ?
                                        callbackSuccess(bodyReturn) :
                                        callbackError(error);

                        }
                );
        }
};
app.listen(3000, function () {
        var callbackSuccess = function (body) {
                console.log("Returned body");
                console.log(body);
        }
        var callbackError = function (error) {
                console.log("Error on request" + error);
        }
        req.post('http://localhost:4000', { "hello": "world" }, callbackSuccess, callbackError);

        let data = { "hello": "world",foo:"bar",num:1,bool:false,bool2:true };
        setInterval(() => {
                req.post('http://localhost:4000', data, callbackSuccess, callbackError);
        }, 2000);
});
