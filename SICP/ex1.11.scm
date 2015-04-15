;;; Recursive Process:

(define (recursive_func n)
    (if (< n 3) 
        n
        (+ (recursive_func (- n 1)) (* 2 (recursive_func (- n 2))) 
        (* 3 (recursive_func (- n 3))))))