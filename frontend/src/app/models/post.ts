import { User } from "./user";


export class Post {
  id?: number;
  title?: string;
  body?: string;
  dateCreated?: Date;
  likes?: number;
  user?: User;
  

  constructor(id?: number, title?: string, body?: string, dateCreated?: Date, likes?: number, user?: User) {
    this.id = id;
    this.title = title;
    this.body = body;
    this.dateCreated = dateCreated;
    this.likes = likes;
    this.user = user;
    
  }
}
