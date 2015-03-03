(define (cube-root radicand) 
  (cube-root-iter 1.0 radicand))

(define (cube-root-iter guess radicand) 
  (define (cube-num num) 
    (* num num num))
  (define (average x y) 
    (/ (+ x y) 2))
  (define (improve-guess) 
    (average guess (/ (+ (/ radicand (square guess)) (* 2 guess)) 3)))
  (define (good-enough?) 
    (< (abs (- (cube-num guess) radicand)) 0.001))
  (if (good-enough?)
    guess
    (cube-root-iter (improve-guess) radicand)))