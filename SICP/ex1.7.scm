(define (sqrt radicand)
  (sqrt-iter 1.0 radicand))

(define (sqrt-iter guess radicand)
  (define (average x y)
    (/ (+ x y) 2))
  (define (improve)
    (average guess (/ radicand guess)))

; define good-enough? in terms of change between guess and improved guess
; to better handle very small and very large numbers

  (define (good-enough?)
    (< (abs (- guess (average guess (/ radicand guess)))) 0.001))
  (if (good-enough?)
      guess
      (sqrt-iter (improve) radicand)))