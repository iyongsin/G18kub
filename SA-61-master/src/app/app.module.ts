import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { MatButtonModule, MatCardModule, MatInputModule, MatListModule, MatToolbarModule, MatCheckboxModule, MatAutocompleteModule, MatDatepickerModule, MatFormFieldModule, MatRadioModule, MatSelectModule, MatSlideToggleModule, MatSliderModule, MatMenuModule, MatGridListModule, MatSidenavModule, MatStepperModule, MatPaginatorModule, MatSortModule, MatTableModule, MatSnackBarModule, MatTooltipModule, MatDialogModule, MatProgressBarModule, MatProgressSpinnerModule, MatIconModule, MatChipsModule, MatButtonToggleModule, MatExpansionModule, MatTabsModule, MatNativeDateModule } from '@angular/material';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { FormsModule } from '@angular/forms';
import { RouterModule, Routes } from '@angular/router';
import { AccountComponent } from './account/account.component';
import { AccountService } from './service/account.service';
import { TableComponent } from './table/table.component';



const appRoutes: Routes = [
  {path: ' ', redirectTo: '/account', pathMatch: 'full'},
  { path: 'table' , component: TableComponent},
  { path: 'account' , component: AccountComponent}
];

@NgModule({
  declarations: [
    AppComponent,
    AccountComponent,
    TableComponent,

  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MatButtonModule,
    MatCardModule,
    MatInputModule,
    MatListModule,
    MatToolbarModule,
    FormsModule,
    RouterModule.forRoot(appRoutes),
    MatCheckboxModule,
    MatAutocompleteModule,
    MatDatepickerModule,
    MatFormFieldModule,
    MatRadioModule,
    MatSelectModule,
    MatSliderModule,
    MatSlideToggleModule,
    MatMenuModule,
    MatSidenavModule,
    MatGridListModule,
    MatCardModule,
    MatStepperModule,
    MatTabsModule,
    MatExpansionModule,
    MatButtonToggleModule,
    MatChipsModule,
    MatIconModule,
    MatProgressSpinnerModule,
    MatProgressBarModule,
    MatDialogModule,
    MatTooltipModule,
    MatSnackBarModule,
    MatTableModule,
    MatSortModule,
    MatPaginatorModule,
    MatNativeDateModule
    ],
  providers: [AccountService],
  bootstrap: [AppComponent]
})
export class AppModule { }
