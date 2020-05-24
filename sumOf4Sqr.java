/***
 Jacobi's four-square theorem
 The number of ways to represent n as the sum of four squares is eight times the sum of the divisors of n if n is odd and 24 times the sum of the odd divisors of n if n is even
 Find the sum of odd and even divisor of n by running a loop from 1 to sqrt(n) .
 ****/
int sum(int n){
        int i, odd = 0, even = 0;

        // iterate from 1 to the number
        for (i = 1; i <= sqrt(n); i++) {
        // if i is the factor of n
        if (n % i == 0) {
        // if factor is even
        if (i % 2 == 0)
        even += i;

        // if factor is odd
        else
        odd += i;

        // n/i is also a factor
        if ((n / i) != i) {
        // if factor is even
        if ((n / i) % 2 == 0)
        even += (n / i);

        // if factor is odd
        else
        odd += (n / i);
        }
        }
        }
        // if n is odd
        if (n % 2 == 1)
        return 8 * (odd + even);

        // if n is even
        else
        return 24 * (odd);
        }