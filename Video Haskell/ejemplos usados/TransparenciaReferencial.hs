-- Define la función square que toma un número entero 'x' y devuelve su cuadrado.
square :: Int -> Int
square x = x * x

main :: IO ()
main = do
  let result1 = square 5
      result2 = 25
  print result1
  print result2
