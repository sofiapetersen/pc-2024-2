def divisores(n)
    i = 1.0
    while i <= n
      if (n % i).zero?
        puts i
      end
      i += 1.0
    end
  end
  
  def main
    puts "Digite um número: "
    x = gets.to_f
    divisores(x)
  end
  
  main
  