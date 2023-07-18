import { Post } from "./post";

export class User {
    id: number;
    username: string;
    password: string;
    email: string;
    enabled: boolean;
    role: string;
    posts: Post[];
    comments: Comment[];
  
    constructor(id: number, username: string, password: string, email: string, enabled: boolean, role: string, posts: Post[], comments: Comment[]) {
      this.id = id;
      this.username = username;
      this.password = password;
      this.email = email;
      this.enabled = enabled;
      this.role = role;
      this.posts = posts;
      this.comments = comments;
    }
  }
  