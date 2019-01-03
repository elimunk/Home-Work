import { Component, OnInit } from '@angular/core';
import { MovieService } from '../movie.service';

@Component({
  selector: 'app-c2',
  templateUrl: './c2.component.html',
  styleUrls: ['./c2.component.css']
})
export class C2Component implements OnInit {

  public myMovieInfo: any;

  public isShow(): boolean {
    if (this.myMovieInfo.selected)
      return true;
    else return false;
  }

  constructor(private myMovieService: MovieService) {
    this.myMovieInfo = this.myMovieService.movieInfo;
  }

  ngOnInit() {
  }

}
