applyTwice :: (a -> a) -> a -> a
applyTwice f x = f (f x)

-- Ejemplo de uso:
multiplyByTwo :: Int -> Int
multiplyByTwo x = x * 2

result = applyTwice multiplyByTwo 2
