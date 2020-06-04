import { Injectable } from '@angular/core';
import { HttpInterceptor } from '@angular/common/http';

@Injectable()
export class AuthInterceptor implements HttpInterceptor {

    intercept(req, next) {
        const newReq = req.clone({withCredentials: true});

        return next.handle(newReq);
    }
}