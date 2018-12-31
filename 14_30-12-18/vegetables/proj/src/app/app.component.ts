import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  public showList:string[]=[];

  public correctChar='a-z'; 

  public isChar:boolean=false;
  public isArrEmpty: boolean=false;

 public getVeg(){
   if(this.correctChar.length<1||this.correctChar.length>1){
    this.showList=[];
    this.isChar=true;
    this.isArrEmpty=false;
  }
   else {
  this.showList=[];
  this.isArrEmpty=false;
  this.isChar=false;
   for (let index = 0; index < this.vegList.length; index++) {
     if( this.vegList[index].charAt(0)==this.correctChar)
    this.showList.push(this.vegList[index]);
   }
   if (this.showList.length==0){
    this.isArrEmpty=true;
   }
  }
 }

  public vegList: string[]=["artichoke",
    "aubergine",
    "amrud",
    "asparagus",
    "legumes",
   "alfalfa", 
   "sprouts",
    "azuki beans"
    ,"bean sprouts"
    ,"black beans"
    ,"black-eyed peas"
     ,"borlotti bean"
    ,"broad beans"
    ,"chickpeas"
   , "green beans"
    ,"kidney beans"
    ,"lentils"
    ,"lima beans"
    ,"mung beans"
    ,"navy beans"
    ,"pinto beans"
    ,"runner beans"
    ,"split peas"
    ,"soy beans"
    ,"peas"
    ,"mangetout"
    ,"broccoflower"
    ,"broccoli"
    ,"brussels"
    ,"cabbag kohlrabi"
    ,"cauliflower"
    ,"celery"
    ,"endive"
    ,"fiddleheads"
    ,"frisee"
    ,"fennel"
    ,"greens"
    ,"beet greens"
    ,"bok choy"
    ,"chard"
    ,"collard greens"
    ,"kale"
    ,"mustard greens"
    ,"spinach"
    , "herbs"
    , "anise"
    , "basil"
    , "caraway"
    , "cilantro"
    , "coriander"
    , "chamomile"
    , "dill"
    , "fennel"
    , "lavender"
    , "lemon Grass"
    , "marjoram"
    , "oregano"
    , "parsley"
    , "rosemary"
    , "sage"
    , "thyme"
    , "lettuce"
    , "arugula"
    , "mushrooms"]

}

