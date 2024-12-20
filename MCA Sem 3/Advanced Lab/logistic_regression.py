import numpy as np
import matplotlib.pyplot as plt
from sklearn.datasets import make_classification
from sklearn.model_selection import train_test_split
from sklearn.metrics import accuracy_score, precision_score, recall_score

# Sigmoid function
def sigmoid(z):
    return 1 / (1 + np.exp(-z))

# Function to train logistic regression
def train_logistic_regression(X, y, learning_rate=0.01, iterations=1000):
    n_samples, n_features = X.shape
    weights = np.zeros(n_features)
    bias = 0

    for _ in range(iterations):
        # Forward pass
        linear_model = np.dot(X, weights) + bias
        y_predicted = sigmoid(linear_model)

        # Compute gradients
        dw = (1 / n_samples) * np.dot(X.T, (y_predicted - y))
        db = (1 / n_samples) * np.sum(y_predicted - y)

        # Update parameters
        weights -= learning_rate * dw
        bias -= learning_rate * db

    return weights, bias

# Function to make predictions
def predict_logistic_regression(X, weights, bias):
    linear_model = np.dot(X, weights) + bias
    return np.where(sigmoid(linear_model) >= 0.5, 1, 0)

# Plot decision boundary function
def plot_decision_boundary(X, y, weights, bias):
    x_min, x_max = X[:, 0].min() - 1, X[:, 0].max() + 1
    y_min, y_max = X[:, 1].min() - 1, X[:, 1].max() + 1
    xx, yy = np.meshgrid(np.arange(x_min, x_max, 0.01), np.arange(y_min, y_max, 0.01))
    grid = np.c_[xx.ravel(), yy.ravel()]
    
    # Use the predict function with weights and bias
    predictions = predict_logistic_regression(grid, weights, bias).reshape(xx.shape)
    
    plt.contourf(xx, yy, predictions, alpha=0.5, cmap=plt.cm.Paired)
    plt.scatter(X[:, 0], X[:, 1], c=y, edgecolor='k', cmap=plt.cm.Paired)
    plt.title("Decision Boundary")
    plt.show()

# Generate synthetic binary dataset
X, y = make_classification(n_samples=100, n_features=2, n_informative=2, n_redundant=0, random_state=42)
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)

# Train logistic regression model
weights, bias = train_logistic_regression(X_train, y_train, learning_rate=0.1, iterations=1000)

# Make predictions
y_pred = predict_logistic_regression(X_test, weights, bias)

# Evaluate model
print("Accuracy:", accuracy_score(y_test, y_pred))
print("Precision:", precision_score(y_test, y_pred))
print("Recall:", recall_score(y_test, y_pred))

# Plot decision boundary
plot_decision_boundary(X, y, weights, bias)