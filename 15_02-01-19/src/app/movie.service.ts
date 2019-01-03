import { Injectable } from '@angular/core';
import { Movie } from './movie.model';

@Injectable({
  providedIn: 'root'
})
export class MovieService {

  public movieInfo: any = {
    selected: null
  };

  public setSelctedMovie(newMovie: Movie): void {
    this.movieInfo.selected = newMovie;
  }
  constructor() { }
}
