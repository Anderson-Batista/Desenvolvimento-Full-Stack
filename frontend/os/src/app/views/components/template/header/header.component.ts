import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-header',
  template: `
    <mat-toolbar class="header mat-elevation-z8">
    <h1 class="mat-elevation-z8">OS System</h1>
    </mat-toolbar>
  `,
  styleUrls: [`./header.component.css`],
})
export class HeaderComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

}
