
interface IFly{
    fly(speed: number):void;
    land():boolean;
}
               
class Plane implements IFly{

    private _pilotName: String;
    private _airlineName: String;
    private _destination: String;

    constructor(pilotName: String, airlineName:String, destination:String ){
        this.pilotName=pilotName;
        this.airlineName=airlineName;
        this.destination=destination;
    }

     set pilotName(pilotName: String){
        this._pilotName=pilotName
    }
     set airlineName(airlineName: String){
        this._airlineName=airlineName
    }
     set destination(destination: String){
        this._destination=destination
    }

    get pilotName():String{
        return this._pilotName;
    }
    get airlineName(): String{
        return this._airlineName;
    }    
    get destination(): String{
        return this._destination;
    }  


    fly(speed: number):void{
        console.log(`I am flying ${speed} mph`)
    }
    land():boolean{
        console.log("I landed successfully")
        return true;
    }

    public toString() : string {
        return `pilotName: ${this.pilotName}, airlineName: ${this.airlineName}, destination: ${this.destination}`;
    }
    public myType():String{
        return "Plane";
    }
}

class Kite implements IFly{

    private _color: String;
    private _price: number;

    constructor(color: String, price:number){
        this.color=color;
        this.price=price;
    }

    set color(color: String){
        this._color=color
    }
    set price(price: number){
        this._price=(price>0)?price:0;
    }

    get color():String{
        return this._color;
    }
    get price(): number{
        return this._price;
    }

    fly(speed: number):void{
        console.log(`I am flying ${speed} mph`)
    }
    land():boolean{
        console.log("I landed successfully")
        return true;
    }

    public toString() : string {
        return `Price: ${this.price}, Color: ${this.color}`;
    }

    public myType():String{
        return "Kite";
    }
}

class Bird implements IFly{
    private _type: String;
    private _age: number;
    private _color: String;

    constructor(type: String, age:number, color:String ){
        this.type=type;
        this.age=age;
        this.color=color;
    }

   set type(type: String){
        this._type=type
    }
    set age(age: number){
        this._age=(age>0)?age:0;
    }
    set color(color: String){
        this._color=color
    }
    get type():String{
    return this._type;
}
get color():String{
    return this._color;
}
get age(): number{
    return this._age;
}

    fly(speed: number):void{
        console.log(`I am flying ${speed} mph`)
    }
    land():boolean{
        console.log("I landed successfully")
        return true;
    }

    public toString() : string {
        return `Type: ${this.type}, Age: ${this.age}, Color: ${this.color}`;
    }

    public myType():String{
        return "Bird";
    }
}


function createFly() :any{
    let num:number=Math.floor(Math.random()*3);
    let obj:IFly;
switch(num) {
case 0:{
return obj=new Bird("pashosh",Math.floor(Math.random()*10), "red" ,);
}
case 1:{
    return obj=new Plane("Bob", "Iberia", "Spain");
}
case 2:{
    return obj=new Kite("Yelow", Math.floor(Math.random()*200));
}
default:{
    return null;
}
}
}

let IFlyArray:any[]= new Array<any>(10);

for (let index = 0; index <IFlyArray.length; index++) {
    IFlyArray[index]=createFly(); 
    console.log(`${IFlyArray[index].myType()} created`);
}

for (let index = 0; index < IFlyArray.length; index++) {
    console.log(`${index+1}. ${IFlyArray[index].myType()}`);
    IFlyArray[index].fly(Math.floor(Math.random()*120));
    console.log(IFlyArray[index].land()); 
}



