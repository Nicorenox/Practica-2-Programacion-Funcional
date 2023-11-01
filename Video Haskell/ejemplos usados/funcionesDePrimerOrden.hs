-- Define la función applyTwice que toma una función 'f' y un valor 'x', y aplica 'f' dos veces a 'x'.
applyTwice :: (a -> a) -> a -> a
applyTwice f x = f (f x)

-- Define una función 'multiplyByTwo' que toma un número entero 'x' y lo multiplica por 2.
multiplyByTwo :: Int -> Int
multiplyByTwo x = x * 2

main :: IO ()
main = do
  let result = applyTwice multiplyByTwo (2 :: Int)
  print result
