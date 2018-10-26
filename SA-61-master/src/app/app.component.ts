import { Component } from '@angular/core';
import {AccountComponent} from './account/account.component';
import {TableComponent} from './table/table.component';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  entryComponents : [AccountComponent, TableComponent]
})
export class AppComponent {
  title = 'System Analysis and Design 61 / 1';
}
