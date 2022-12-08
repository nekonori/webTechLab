const fs = require("fs");

fs.readFile(__dirname + "\\data.txt", "utf-8", (err, data) =>
  console.log(data)
);
