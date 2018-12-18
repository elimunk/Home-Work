var sum: number=0;
var avg: number=0;
var biggestNum: number=0;
var smallestNum : number=0;
var bigIndex: number=0;
var smallIndex: number=0;
var sumEvenNun: number=0;
var sumOddNum: number=0;
var numPozitiveNum: number=0;
var numNegativeNum: number=0;
                                   //---- define the array----
var array :number[]= new Array<number>(10);
for (let index = 0; index < array.length; index++) {
     array[index]=Math.floor(Math.random()*200);
}
smallestNum=array[0];
                                      //---- calculate data---- 
for (let index = 0; index < array.length; index++) {
    console.log(array[index]);
    sum+=array[index];
    if(biggestNum<array[index]){
        biggestNum=array[index];
        bigIndex=index;}
    if(smallestNum>array[index]){
        smallestNum=array[index];
        smallIndex=index;}
    if(array[index]%2==0)
    sumEvenNun+=array[index];
    if(array[index]%2==1)
    sumOddNum+=array[index];
    if(array[index]>0)
    numPozitiveNum++;
    if(array[index]==0)
    numNegativeNum++;
 }
                            //---- print all data----   
 console.log(`sum of all numbers is: ${sum}`);
 console.log(`avrage the numbers in the array is: ${sum/array.length}`);
 console.log(`The biggest number in the array is: ${biggestNum}`);
 console.log(`The smallest  number in the array is: ${smallestNum}`);
 console.log(`The index of the biggest number in the array is: ${bigIndex}`);
 console.log(`The index of the smallest number in the array is: ${smallIndex}`);
 console.log(`sum of the Even numbers is: ${sumEvenNun}`);
 console.log(`sum of the odd numbers is: ${sumOddNum}`);
 console.log(`num of the Pozitive numbers is: ${numPozitiveNum}`);
 console.log(`num of the Negative numbers is: ${numNegativeNum}`);





