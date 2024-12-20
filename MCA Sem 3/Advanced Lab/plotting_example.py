import matplotlib.pyplot as plt

# Sample data
x = [1, 2, 3, 4]
y = [1, 4, 9, 16]

# Create a line plot
plt.plot(x, y)

# Add labels and title
plt.xlabel('X-axis')
plt.ylabel('Y-axis')
plt.title('Simple Line Plot')
plt.grid()

# Display the plot
plt.show()