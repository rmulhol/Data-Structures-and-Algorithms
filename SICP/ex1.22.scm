(define (find-next-three-primes-after floor)
  (if (odd? floor)
      (find-next-x-primes floor 3)
      (find-next-x-primes (+ floor 1) 3)))

(define (find-next-x-primes floor x)
  (timed-prime-test floor)
  (if (= x 0) 
      (newline)
      (if (prime? floor)
          (find-next-x-primes (+ floor 2) (- x 1))
          (find-next-x-primes (+ floor 2) x))))

(define (timed-prime-test n)
  (newline)
  (display n)
  (start-prime-test n (runtime)))

(define (start-prime-test n start-time)
  (if (prime? n)
      (report-prime (- (runtime) start-time))))

(define (report-prime elapsed-time)
  (display " *** ")
  (display elapsed-time))

(define (prime? n)
  (= n (smallest-divisor n)))

(define (smallest-divisor n) (find-divisor n 2))

(define (find-divisor n test-divisor)
  (cond ((> (square test-divisor) n) n)
        ((divides? test-divisor n) test-divisor)
        (else (find-divisor n (+ test-divisor 1)))))

(define (divides? a b) (= (remainder b a) 0))