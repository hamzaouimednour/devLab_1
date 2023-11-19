// user.service.ts
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { HttpErrorHandlerService } from './http-error-handler.service';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  private baseUrl = `${environment.apiUrl}/users`;

  constructor(private http: HttpClient, private errorHandler: HttpErrorHandlerService) { }

  getUsers(): Observable<any[]> {
    return this.http.get<any[]>(`${this.baseUrl}`)
      .pipe(
        catchError(this.errorHandler.handleError)
      );
  }

  getUserById(id: number): Observable<any> {
    return this.http.get<any>(`${this.baseUrl}/${id}`)
      .pipe(
        catchError(this.errorHandler.handleError)
      );
  }

  // More methods for creating, updating, and deleting users as needed
}
