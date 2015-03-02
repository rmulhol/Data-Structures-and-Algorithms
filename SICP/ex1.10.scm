(define (Ackermann x y)
  (cond ((= y 0) 0)
        ((= x 0) (* 2 y))
        ((= y 1) 2)
        (else (Ackermann (- x 1) (Ackermann x (- y 1))))))

(define (explain-ackermann) 
  (display (string "Given an implementation of Ackermann's function:

    (define (Ackermann x y)
      (cond ((= y 0) 0)
            ((= x 0) (* 2 y))
            ((= y 1) 2)
            (else (Ackermann (- x 1) (Ackermann x (- y 1))))))

    -- (Ackermann 1 10) results in 1024.
    -- (Ackermann 2 4) results in 65536.
    -- (Ackermann 3 3) results in 65536.

    If we implement the following procedures: 

    (define (f n) (Ackermann 0 n))
    (define (g n) (Ackermann 1 n))
    (define (h n) (Ackermann 2 n))

    -- (f n) == 2n
    -- (g n) == 2 ^ n
    -- (h n) == 2 ^ 2 ^ 2 ... 
                where n denotes the number of times 2 appears in the sequence.
    ")))

(define (f n) (Ackermann 0 n))
(define (g n) (Ackermann 1 n))
(define (h n) (Ackermann 2 n))
(define (k n) (* 5 n n))