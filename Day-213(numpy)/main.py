from PIL import Image
import numpy as np

# 1. Load Image
def load_image(path):
    image = Image.open(path).convert("RGB")
    return np.array(image)


# 2. Display Basic Image Information
def image_info(img):
    print("Shape:", img.shape)
    print("Data type:", img.dtype)
    print("Minimum pixel value:", img.min())
    print("Maximum pixel value:", img.max())


# 3. Convert RGB Image to Grayscale
def grayscale(img):
    gray = (
        0.299 * img[:, :, 0] +
        0.587 * img[:, :, 1] +
        0.114 * img[:, :, 2]
    )
    return gray.astype(np.uint8)


# 4. Image Negative
def negative(img):
    return 255 - img


# 5. Brightness Adjustment
def change_brightness(img, value):
    result = img.astype(np.int16) + value
    return np.clip(result, 0, 255).astype(np.uint8)


# 6. Contrast Adjustment
def change_contrast(img, factor):
    result = 128 + factor * (img.astype(np.float32) - 128)
    return np.clip(result, 0, 255).astype(np.uint8)


# 7. Thresholding
def threshold(img, threshold_value=128):
    return np.where(img >= threshold_value, 255, 0).astype(np.uint8)


# 8. Crop Image
def crop(img, x1, y1, x2, y2):
    return img[y1:y2, x1:x2]


# 9. Flip Image
def flip_horizontal(img):
    return np.flip(img, axis=1)


def flip_vertical(img):
    return np.flip(img, axis=0)


# 10. Rotate Image 90 Degrees
def rotate_90(img):
    return np.rot90(img)


# 11. Resize using NumPy (Nearest Neighbor)
def resize_nearest(img, new_height, new_width):

    old_height, old_width = img.shape[:2]

    row_indices = (
        np.linspace(0, old_height - 1, new_height)
        .astype(int)
    )

    col_indices = (
        np.linspace(0, old_width - 1, new_width)
        .astype(int)
    )

    return img[row_indices[:, None], col_indices]


# 12. Extract Color Channel
def red_channel(img):
    result = np.zeros_like(img)
    result[:, :, 0] = img[:, :, 0]
    return result


def green_channel(img):
    result = np.zeros_like(img)
    result[:, :, 1] = img[:, :, 1]
    return result


def blue_channel(img):
    result = np.zeros_like(img)
    result[:, :, 2] = img[:, :, 2]
    return result


# 13. Save NumPy Array as Image
def save_image(img, path):
    Image.fromarray(img).save(path)

