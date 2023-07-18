import { TestBed } from '@angular/core/testing';

import { PostTagsService } from './post-tags.service';

describe('PostTagsService', () => {
  let service: PostTagsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PostTagsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
