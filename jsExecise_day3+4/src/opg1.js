
let boys = ["Peter", "Lars", "Ole"];
let girls = ["Janne", "Hanne", "Sanne"];

let all = boys.concat(girls);
console.log("All: " + all);


all.join(', ');
console.log("c join: " + all );


let x = all.join(' - ');
console.log("d join: " + x);


//all.push(" Hanne", " Gitte");
// console.log("e push: " + x);


let newAll = ["Hans", " Kurt", ... all];
console.log("e unshift: " + newAll);

newAll.shift();
console.log("g shift: " + newAll);

newAll.pop();
console.log("f pop: " + newAll);

let z = new Array(newAll);
newAll.splice(2, 1);
console.log("g splice: " + newAll);

newAll.reverse();
console.log("h reverse: " + newAll);

newAll.sort();
console.log("i sort: " + newAll);


var f1 = function(n1,n2, callback){
  return ": "+n1+" and "+n2+" = "+callback(n1,n2);
};      





