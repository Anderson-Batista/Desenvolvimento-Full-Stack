import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-footer',
  template: 
  `
  <mat-toolbar class="footer">
    <p class="mat-elevation-z8">by lioc3sar</p>
  </mat-toolbar>
  `,
  styleUrls: [`./footer.component.css`]
})
export class FooterComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

}
