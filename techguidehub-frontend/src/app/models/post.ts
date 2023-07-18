import { User } from './user'; // Import User model
//import { Tag } from './tag'; // Import Tag model

export class Post {
  id?: number;
  title?: string;
  body?: string;
  dateCreated?: Date;
  likes?: number;
  user?: User;
  //tags?: Tag[];

  constructor(id?: number, title?: string, body?: string, dateCreated?: Date, likes?: number, user?: User) {   // need to add tag[] to the parameters
    this.id = id; 
    this.title = title;
    this.body = body;
    this.dateCreated = dateCreated;
    this.likes = likes;
    this.user = user;
    //this.tags = tags;
  }
}
