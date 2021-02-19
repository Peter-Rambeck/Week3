// Function Declaration
// Observe: no return type, no type on parameters
function add(n1, n2){
   return n1 +n2;
}

// Function Expression
var sub = function(n1,n2){
  return n1 - n2
} 

// Callback example
/*
    var cb = function(n1, n2, callback){  
        try {
             if ( typeof n1 !== "number" ) throw " Not a number";
             if ( typeof n2 !== "number" ) throw " Not a number";
             if ( typeof callback !== "function" ) throw " Not a function";
             return "Result from the two numbers: " + n1 + "+" + n2 + "=" + (callback(n1, n2));
        } catch (e) {
          console.log("Exception" +  e);
        }     
    }
 * 
 */
     
// returns 3
console.log("1: "+ add(1, 2));

// fail
console.log("2: "+ add());

// returns 3
console.log("3: "+ add(1, 2, 3));

// fail
console.log("4: "+ add(1));

// reference 'add' returns 6
console.log("5: " + cb(3, 3, add));

// reference 'sub' returns 1
console.log("6: " +  cb(4,3,sub));

// Call 'add' but no parameters. returns fail
console.log("7: " +  cb(3,3,add()));

// referece 'add' returns 3hh
console.log("8: " +  cb(3,"hh",add));


// #4
let mul = function(n1, n2) {
    return n1/n2;
} 

 let cb = function(n1, n2, callback){  
        try {
             if ( typeof n1 !== "number" ) throw " Not a number";
             if ( typeof n2 !== "number" ) throw " Not a number";
             if ( typeof callback !== "function" ) throw " Not a function";
             return "Result from the two numbers: " + n1 + "+" + n2 + "=" + (callback(n1, n2));
        } catch (e) {
          console.log("Exception" +  e);
        }     
   }
   // #5
   let anon = () => cb(1, 2, mul);
  
  // Getting comfortable with filter, map and forEach:
  // #1        
  let arr = new Array("Peter", "Hans", "Klods", "Ged");
  let arrFilter = arr.filter(arr => arr.length <= 3);
  
  // #2
  let newArr = arr.map(function(up) {
      return up.toUpperCase()
  });
  
  // #3
  let funArr = new Array("Lars", "Peter", "Jan", "Ian");
  let funFun = funArr.map(function(x){
      return "<li>" + x + "</li>"; 
  });
  let fun = funFun.join("");
  
  
  