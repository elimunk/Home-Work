

var array :number[]= new Array<number>(10);


function setArray(array:number[] ){
for (let index = 0; index < array.length; index++) {
    array[index]=Math.floor(Math.random()*200);
    console.log(array[index]);
}
}

function sumOfArray(array:number[] ){
    var sum: number=0;
    for (let index = 0; index < array.length; index++) {
        sum+=array[index];
    }  console.log(`sum of all numbers is: ${sum}`);
}

function avgOfArray(array:number[] ){
    var sum: number=0;
    for (let index = 0; index < array.length; index++) {
        sum+=array[index];
    }  console.log(`avrage the numbers in the array is: ${sum/array.length}`);
}

function biggestNumArray(array:number[] ){
    var biggestNum: number=0;
    for (let index = 0; index < array.length; index++) {
        if(biggestNum<array[index]){
            biggestNum=array[index];}
    }  console.log(`The biggest number in the array is: ${biggestNum}`);
}

function smallestNumArray(array:number[] ){
    var smallestNum: number=array[0];
    for (let index = 0; index < array.length; index++) {
        if(smallestNum>array[index]){
            smallestNum=array[index];}
    }  console.log(`The smallest  number in the array is: ${smallestNum}`);
}

function indexBigNumArray(array:number[] ){
    var biggestNum: number=0;
    var bigIndex: number=0;
    for (let index = 0; index < array.length; index++) {
        if(biggestNum<array[index]){
            biggestNum=array[index];
            bigIndex=index  ;}
    }  console.log(`The index of the biggest number in the array is: ${bigIndex}`);
}
       
function indexSmallNumArray(array:number[] ){
    var smallestNum: number=array[0];
    var smallIndex: number=0;
     for (let index = 0; index < array.length; index++) {
         if(smallestNum>array[index]){
             smallestNum=array[index];
             smallIndex=index;}
     }  console.log(`The index of the smallest number in the array is: ${smallIndex}`);
 }

 function evenNumOfArray(array:number[] ){
var sumEvenNun: number=0;
    for (let index = 0; index < array.length; index++) {
        if(array[index]%2==0)
        sumEvenNun+=array[index];
    }  console.log(`sum of the Even numbers is: ${sumEvenNun}`);
}

function oddNumOfArray(array:number[] ){
    var sumOddNum: number=0;
        for (let index = 0; index < array.length; index++) {
            if(array[index]%2==1)
            sumOddNum+=array[index];
        }  console.log(`sum of the odd numbers is: ${sumOddNum}`);
    }

function positiveNumOfArray(array:number[] ){
   var numPozitiveNum: number=0;
        for (let index = 0; index < array.length; index++) {
            if(array[index]>0)
            numPozitiveNum++;
        }  console.log(`num of the Pozitive numbers is: ${numPozitiveNum}`);
    }

function negativeNumOfArray(array:number[] ){
    var numNegativeNum: number=0;
        for (let index = 0; index < array.length; index++) {
            if(array[index]==0)
            numNegativeNum++;
        }  console.log(`num of the Negative numbers is: ${numNegativeNum}`);
    }


setArray(array);
sumOfArray(array);
avgOfArray(array);
biggestNumArray(array);
smallestNumArray(array);
indexBigNumArray(array);
indexSmallNumArray(array);
evenNumOfArray(array);
oddNumOfArray(array);
positiveNumOfArray(array);
negativeNumOfArray(array);
