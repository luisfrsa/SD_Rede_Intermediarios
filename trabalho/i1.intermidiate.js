var express = require('express');
var app = express();
var bodyParser = require("body-parser");
app.use(bodyParser.json());       // to support JSON-encoded bodies
app.use(bodyParser.urlencoded({     // to support URL-encoded bodies
  extended: false
})); 

app.get('/', function (req, res) {
  res.send('Hello World!');
});


app.post('/', function (req, res) {

  console.log(req.query);
  // console.log(req.param('hello', null));  // second parameter is default
  // console.log(req.params('hello'));  // second parameter is default
  res.send('POST received OK');


});

app.listen(4000, function () {
  console.log('Example app listening on port 4000!');
});

