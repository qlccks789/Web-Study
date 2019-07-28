const crypto = require("crypto");

// md5, sha256, sha512
let sha1 = crypto.createHash("sha1");

let msg = "hong1234";

sha1.update(msg);

let output = sha1.digest("hex"); // hex, binary, base64
console.log("원본 : " + msg);
console.log("해시 : " + output);