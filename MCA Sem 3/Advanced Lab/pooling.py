import cv2
import numpy as np
import matplotlib.pyplot as plt

def max_pooling(image, kernel_size=2):
    # Get image dimensions
    height, width = image.shape
    
    # Calculate output dimensions
    output_height = height // kernel_size
    output_width = width // kernel_size
    
    # Initialize output array
    output = np.zeros((output_height, output_width), dtype=image.dtype)
    
    # Perform max pooling
    for y in range(output_height):
        for x in range(output_width):
            # Extract the current pooling window
            window = image[
                y*kernel_size:(y+1)*kernel_size, 
                x*kernel_size:(x+1)*kernel_size
            ]
            
            # Store the maximum value in the output
            output[y, x] = np.max(window)
    
    return output

def min_pooling(image, kernel_size=2):
    # Get image dimensions
    height, width = image.shape
    
    # Calculate output dimensions
    output_height = height // kernel_size
    output_width = width // kernel_size
    
    # Initialize output array
    output = np.zeros((output_height, output_width), dtype=image.dtype)
    
    # Perform min pooling
    for y in range(output_height):
        for x in range(output_width):
            # Extract the current pooling window
            window = image[
                y*kernel_size:(y+1)*kernel_size, 
                x*kernel_size:(x+1)*kernel_size
            ]
            
            # Store the minimum value in the output
            output[y, x] = np.min(window)
    
    return output

def average_pooling(image, kernel_size=2):
    # Get image dimensions
    height, width = image.shape
    
    # Calculate output dimensions
    output_height = height // kernel_size
    output_width = width // kernel_size
    
    # Initialize output array
    output = np.zeros((output_height, output_width), dtype=image.dtype)
    
    # Perform average pooling
    for y in range(output_height):
        for x in range(output_width):
            # Extract the current pooling window
            window = image[
                y*kernel_size:(y+1)*kernel_size, 
                x*kernel_size:(x+1)*kernel_size
            ]
            
            # Store the average value in the output
            output[y, x] = np.mean(window)
    
    return output

def main():
    # Read a grayscale image using OpenCV
    # Note: Replace 'image.png' with the actual image path
    image = cv2.imread('image.png', cv2.IMREAD_GRAYSCALE)
    
    # Check if image is loaded successfully
    if image is None:
        print("Error: Could not read the image.")
        return
    
    # Define a single kernel size (e.g., 2)
    kernel_size = 2
    
    # Create a figure with subplots for original and different pooled images
    plt.figure(figsize=(15, 5))
    
    # Original image
    plt.subplot(1, 4, 1)
    plt.title('Original Image')
    plt.imshow(image, cmap='gray')
    plt.axis('off')
    
    # Apply max pooling
    max_pooled_image = max_pooling(image, kernel_size)
    plt.subplot(1, 4, 2)
    plt.title(f'Max Pooling\n{kernel_size}x{kernel_size}')
    plt.imshow(max_pooled_image, cmap='gray')
    plt.axis('off')
    
    # Apply min pooling
    min_pooled_image = min_pooling(image, kernel_size)
    plt.subplot(1, 4, 3)
    plt.title(f'Min Pooling\n{kernel_size}x{kernel_size}')
    plt.imshow(min_pooled_image, cmap='gray')
    plt.axis('off')
    
    # Apply average pooling
    avg_pooled_image = average_pooling(image, kernel_size)
    plt.subplot(1, 4, 4)
    plt.title(f'Average Pooling\n{kernel_size}x{kernel_size}')
    plt.imshow(avg_pooled_image, cmap='gray')
    plt.axis('off')
    
    # Save the pooled images
    cv2.imwrite(f'max_pooled_image_kernel_{kernel_size}.jpg', max_pooled_image)
    cv2.imwrite(f'min_pooled_image_kernel_{kernel_size}.jpg', min_pooled_image)
    cv2.imwrite(f'avg_pooled_image_kernel_{kernel_size}.jpg', avg_pooled_image)
    
    # Print dimensions
    print(f"Kernel Size {kernel_size}x{kernel_size} - Pooled Image Dimensions:")
    print(f"Max Pooled Image: {max_pooled_image.shape}")
    print(f"Min Pooled Image: {min_pooled_image.shape}")
    print(f"Average Pooled Image: {avg_pooled_image.shape}")
    
    plt.tight_layout()
    plt.show()

if __name__ == "__main__":
    main()