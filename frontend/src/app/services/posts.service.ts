import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Post } from '../models/post';
@Injectable({
  providedIn: 'root'
})
export class PostService {
  private postsUrl = 'http://localhost:4200/posts'; // URL to your Spring Boot backend

  httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
  };

  constructor(private http: HttpClient) { } // Inject HttpClient

  // Method to create a new post
  createPost(post: Post): Observable<Post> {
    return this.http.post<Post>(this.postsUrl, post, this.httpOptions);
  }
}
