import matplotlib.pyplot as plt

def linear_regression(x, y):

    n = len(x)
    sum_x = sum(x)
    sum_y = sum(y)
    sum_xy = sum(x[i] * y[i] for i in range(n))
    sum_x2 = sum(x[i] ** 2 for i in range(n))
    
    # Calculating the coefficients
    m = (n * sum_xy - sum_x * sum_y) / (n * sum_x2 - (sum_x ** 2))
    b = (sum_y - m * sum_x) / n
    
    return m, b

def calculate_error(x, y, m, b):
    
    sse = sum((y[i] - (m * x[i] + b)) ** 2 for i in range(len(x)))
    return sse

def plot_regression(x, y, m, b):
    plt.scatter(x, y, color="blue", label="Data points")
    
    # Plot the best fit line
    x_line = list(range(min(x), max(x) + 1))
    y_line = [m * xi + b for xi in x_line]
    plt.plot(x_line, y_line, color="red", label="Best fit line")
    
    # Add labels and legend
    plt.xlabel("X")
    plt.ylabel("Y")
    plt.title("Linear Regression: Best Fit Line")
    plt.legend()
    plt.grid()
    plt.show()

# Sample Data
x = [-4, -3, -2, -1, 0, 1, 2, 3, 4, 5]
y = [21, 12, 4, 1, 2, 7, 15, 30, 45, 67]

# Perform Linear Regression
m, b = linear_regression(x, y)

# Calculate Error
error = calculate_error(x, y, m, b)

# Plot Results
plot_regression(x, y, m, b)

# Print Results
print(f"The best fit line is y = {m:.6f}x + {b:.6f}")
print(f"Sum of Squared Errors (SSE): {error:.6f}")