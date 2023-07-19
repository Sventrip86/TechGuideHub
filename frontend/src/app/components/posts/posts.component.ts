import { Component } from '@angular/core';
import { PostService } from 'src/app/services/posts.service';
import { Post } from 'src/app/models/post';


@Component({
  selector: 'app-posts',
  templateUrl: './posts.component.html',
  styleUrls: ['./posts.component.css']
})
export class PostsComponent {
  post = new Post();
  submitted = false;

  constructor(private postService: PostService) { } // Inject PostService

  onSubmit() {
    this.submitted = true;
    this.postService.createPost(this.post).subscribe( // Call the service to create post
      data => console.log(data), // Log the data on success
      error => console.log(error) // Log errors if any
    );
  }


}
