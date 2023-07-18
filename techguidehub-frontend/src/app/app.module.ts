import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UsersComponent } from './components/users/users.component';
import { PostsComponent } from './components/posts/posts.component';
import { CommentsComponent } from './components/comments/comments.component';
import { CategoriesComponent } from './components/categories/categories.component';
import { QuestionsComponent } from './components/questions/questions.component';
import { AnswersComponent } from './components/answers/answers.component';
import { TagsComponent } from './components/tags/tags.component';
import { PostTagsComponent } from './components/post-tags/post-tags.component';
import { FormsModule } from '@angular/forms'; 
import { HttpClientModule } from '@angular/common/http'; 

@NgModule({
  declarations: [
    AppComponent,
    UsersComponent,
    PostsComponent,
    CommentsComponent,
    CategoriesComponent,
    QuestionsComponent,
    AnswersComponent,
    TagsComponent,
    PostTagsComponent
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
