var array = new Array(10);
function setArray(array) {
    for (var index = 0; index < array.length; index++) {
        array[index] = Math.floor(Math.random() * 200);
        console.log(array[index]);
    }
}
function sumOfArray(array) {
    var sum = 0;
    for (var index = 0; index < array.length; index++) {
        sum += array[index];
    }
    console.log("sum of all numbers is: " + sum);
}
function avgOfArray(array) {
    var sum = 0;
    for (var index = 0; index < array.length; index++) {
        sum += array[index];
    }
    console.log("avrage the numbers in the array is: " + sum / array.length);
}
function biggestNumArray(array) {
    var biggestNum = 0;
    for (var index = 0; index < array.length; index++) {
        if (biggestNum < array[index]) {
            biggestNum = array[index];
        }
    }
    console.log("The biggest number in the array is: " + biggestNum);
}
function smallestNumArray(array) {
    var smallestNum = array[0];
    for (var index = 0; index < array.length; index++) {
        if (smallestNum > array[index]) {
            smallestNum = array[index];
        }
    }
    console.log("The smallest  number in the array is: " + smallestNum);
}
function indexBigNumArray(array) {
    var biggestNum = 0;
    var bigIndex = 0;
    for (var index = 0; index < array.length; index++) {
        if (biggestNum < array[index]) {
            biggestNum = array[index];
            bigIndex = index;
        }
    }
    console.log("The index of the biggest number in the array is: " + bigIndex);
}
function indexSmallNumArray(array) {
    var smallestNum = array[0];
    var smallIndex = 0;
    for (var index = 0; index < array.length; index++) {
        if (smallestNum > array[index]) {
            smallestNum = array[index];
            smallIndex = index;
        }
    }
    console.log("The index of the smallest number in the array is: " + smallIndex);
}
function evenNumOfArray(array) {
    var sumEvenNun = 0;
    for (var index = 0; index < array.length; index++) {
        if (array[index] % 2 == 0)
            sumEvenNun += array[index];
    }
    console.log("sum of the Even numbers is: " + sumEvenNun);
}
function oddNumOfArray(array) {
    var sumOddNum = 0;
    for (var index = 0; index < array.length; index++) {
        if (array[index] % 2 == 1)
            sumOddNum += array[index];
    }
    console.log("sum of the odd numbers is: " + sumOddNum);
}
function positiveNumOfArray(array) {
    var numPozitiveNum = 0;
    for (var index = 0; index < array.length; index++) {
        if (array[index] > 0)
            numPozitiveNum++;
    }
    console.log("num of the Pozitive numbers is: " + numPozitiveNum);
}
function negativeNumOfArray(array) {
    var numNegativeNum = 0;
    for (var index = 0; index < array.length; index++) {
        if (array[index] == 0)
            numNegativeNum++;
    }
    console.log("num of the Negative numbers is: " + numNegativeNum);
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
