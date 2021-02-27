
let boys = ["Peter", "Lars", "Ole"];
let girls = ["Janne", "Hanne", "Sanne"];
console.log(boys);
console.log(girls);


let concat = [...boys, ...girls];
console.log(concat);


const join1 = concat.join(", ");
console.log(join1);
console.log(typeof(join1));

concat.push("Hans");
console.log(concat);

// Shift remove 1st element
concat.shift();
console.log(concat);

// POP remove last element
concat.pop();
console.log(concat);

// Splice ( index, deleteCount )
concat.splice(1, 2);
console.log(concat);


// concat.sort((a :string, b:String) => {return a.localCompare(b)}); 
concat.sort( (a, b) =>  {return a.localeCompare(b)});
console.log("Sort " + concat);
console.log(typeof(concat));

console.log(concat.map((x) => x+"1" + x.length));

console.log(concat.filter( (x) => x.length > 4));


//
//let all = boys.concat(girls);
//console.log("All: " + all);
//
//
//all.join(', ');
//console.log("c join: " + all );
//
//
//let x = all.join(' - ');
//console.log("d join: " + x);
//
//
////all.push(" Hanne", " Gitte");
//// console.log("e push: " + x);
//
//
//let newAll = ["Hans", " Kurt", ... all];
//console.log("e unshift: " + newAll);
//
//newAll.shift();
//console.log("g shift: " + newAll);
//
//newAll.pop();
//console.log("f pop: " + newAll);
//
//let z = new Array(newAll);
//newAll.splice(2, 1);
//console.log("g splice: " + newAll);
//
//newAll.reverse();
//console.log("h reverse: " + newAll);
//
//newAll.sort();
//console.log("i sort: " + newAll);
//
//
//var f1 = function(n1,n2, callback){
//  return ": "+n1+" and "+n2+" = "+callback(n1,n2);
//};      





