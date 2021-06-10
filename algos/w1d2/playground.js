var x = 10;
var y = x;

y += 10;
x += 30;

console.log(x); // 40?
console.log(y); // 20? 

var a = [1,2,3,4];
var b = a;

a.push(10);
b.push(10);

console.log(a); // [1,2,3,4, 10? ]
console.log(b); // [1,2,3,4, 10? ]