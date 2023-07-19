import { Component } from '@angular/core';
import { Post } from 'src/app/models/post';
import { PostService } from 'src/app/posts.service';
import {MatSelectModule} from '@angular/material/select';
import {MatInputModule} from '@angular/material/input';
import {MatFormFieldModule} from '@angular/material/form-field';

@Component({
  selector: 'app-posts',
  templateUrl: './posts.component.html',
  styleUrls: ['./posts.component.css'],
  
})
export class PostsComponent {

  post = new Post(); // Create an empty post
  submitted = false; // Flag to indicate form is submitted

  constructor(private postService: PostService) { } // Inject PostService

  onSubmit() {
    this.submitted = true;
    this.postService.createPost(this.post).subscribe( // Call the service to create post
      data => console.log(data), // Log the data on success
      error => console.log(error) // Log errors if any
    );
  }
}
