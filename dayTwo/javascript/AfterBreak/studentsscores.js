


const prompt = require("prompt-sync") ();

const score1= prompt("Enter a positive number : ");

const score2= prompt("Enter a positive number : ");
const score3= prompt("Enter a positive number : ");

const averagerscores = (score1+ score2 + score3)/3

             if(averagerscores >=90){

                  console.log("A");
           }
              

             if(80 <=  averagerscores <89){

                  console.log("B");
              }
                   

             if(70<= averagerscores <=79){

                  console.log("C");
              }
                    

             if(60<= averagerscores <= 69){

                  console.log("D");
              }
                 

             if(averagerscores <=59){

                  console.log("F");
              }
                else{
                        console.log("Invalid input")
    }   
       
