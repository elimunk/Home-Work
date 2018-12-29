import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

public toShow:boolean= false;

  public singelMovie={
    "id":0,
    "movie_name":"none",
    "price": "none",
    "movie_date": "none"
  }
  public movies: any[]=[{
    "id": 1,
    "movie_name": "Coraline",
    "price": "7.13",
    "movie_date": "7/9/2017"
    }, {
    "id": 2,
    "movie_name": "Finding Dory",
    "price": "10.09",
    "movie_date": "12/12/2016"
    }, {
    "id": 3,
    "movie_name": "The Wailing",
    "price": "10.69",
    "movie_date": "3/9/2017"
    }, {
    "id": 4,
    "movie_name": "The Void",
    "price": "8.85",
    "movie_date": "10/30/2017"
    }, {
    "id": 5,
    "movie_name": "Tower",
    "price": "8.47",
    "movie_date": "4/6/2017"
    }];
 
public getMovieDeta(movie_name: string){
  for (let index = 0; index < this.movies.length; index++) {
    if( this.movies[index].movie_name== movie_name){
      this.singelMovie = this.movies[index];
      this.toShow=true;
 }
  }


}

}
