import { Component, OnInit } from '@angular/core';
import { UserService } from 'src/app/users.service';
import { User } from 'src/app/models/user';

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.css']
})
export class UsersComponent implements OnInit {

  users: User[] = [];

  constructor(private userService: UserService) {}

  ngOnInit(){
    this.getUsers();

  }

  getUsers(): void {
    this.userService.getUsers()
      .subscribe(users => this.users = users);
  }



}
