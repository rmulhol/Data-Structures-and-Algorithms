(define (sum-of-squares-of-bigger-two a b c)
  (cond 
    ((and (> a c) (> b c)) (+ (square a) (square b)))
    ((and (> a b) (> c b)) (+ (square a) (square c)))
    (else (+ (square b) (square c)))
  )
)