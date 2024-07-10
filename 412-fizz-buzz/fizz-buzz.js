/**
 * @param {number} n
 * @return {string[]}
 */
var fizzBuzz = function(n) {
    const res=[];
    for(let a=1; a<=n;a++){
        if(a%3==0&&a%5==0){
            res.push("FizzBuzz")
            console.log("F");
        }
        else if(a%3==0){
            res.push("Fizz");
            console.log("Fizz");
        }
        else if(a%5==0){
            res.push("Buzz");
            console.log("Buzz");
        }
        else{
            res.push(String(a));
            console.log("a");
        }
    }
    return res;
};