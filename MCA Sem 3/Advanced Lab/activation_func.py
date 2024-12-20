import matplotlib.pyplot as plt

def sigmoid(x):
    result = []
    for xi in x:
        value = 1 / (1 + (2.71828 ** -xi))
        result.append(value)
    return result

def tanh(x):
    result = []
    for xi in x:
        numerator = (2.71828 ** xi - 2.71828 ** -xi)
        denominator = (2.71828 ** xi + 2.71828 ** -xi)
        value = numerator / denominator
        result.append(value)
    return result

def relu(x):
    result = []
    for xi in x:
        value = xi if xi > 0 else 0
        result.append(value)
    return result

def leaky_relu(x, alpha=0.01):
    result = []
    for xi in x:
        value = xi if xi > 0 else alpha * xi
        result.append(value)
    return result

def softmax(x):
    max_x = max(x)  # To prevent overflow
    exp_x = []
    for xi in x:
        exp_value = 2.71828 ** (xi - max_x)
        exp_x.append(exp_value)
    sum_exp_x = sum(exp_x)
    result = []
    for e in exp_x:
        value = e / sum_exp_x
        result.append(value)
    return result

# Input data
def generate_input():
    result = []
    for i in range(100):
        value = -10 + 0.2 * i
        result.append(value)
    return result

if __name__ == "__main__":
    x = generate_input()

    # Calculate outputs
    y_sigmoid = sigmoid(x)
    y_tanh = tanh(x)
    y_relu = relu(x)
    y_leaky_relu = leaky_relu(x)
    y_softmax = softmax(x)

    # Plot
    plt.figure(figsize=(10, 6))

    plt.subplot(3, 2, 1)
    plt.plot(x, y_sigmoid, label="Sigmoid")
    plt.title("Sigmoid")
    plt.grid()

    plt.subplot(3, 2, 2)
    plt.plot(x, y_tanh, label="Tanh", color='orange')
    plt.title("Tanh")
    plt.grid()

    plt.subplot(3, 2, 3)
    plt.plot(x, y_relu, label="ReLU", color='green')
    plt.title("ReLU")
    plt.grid()

    plt.subplot(3, 2, 4)
    plt.plot(x, y_leaky_relu, label="Leaky ReLU", color='red')
    plt.title("Leaky ReLU")
    plt.grid()

    plt.subplot(3, 2, 5)
    plt.plot(x, y_softmax, label="SoftMax", color='purple')
    plt.title("SoftMax")
    plt.grid()

    plt.tight_layout()
    plt.show()