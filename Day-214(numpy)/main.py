from PIL import Image
import numpy as np

img = np.array(Image.open("input.jpg").convert("RGB"))

print("Shape:", img.shape)

# 1. Add brightness using broadcasting
bright = np.clip(img + 50, 0, 255).astype(np.uint8)

# 2. Different brightness for R, G, B
brightness = np.array([50, 20, -30])
adjusted = np.clip(img + brightness, 0, 255).astype(np.uint8)

# 3. Multiply RGB channels by different factors
factors = np.array([1.2, 1.0, 0.8])
contrast = np.clip(img * factors, 0, 255).astype(np.uint8)

# 4. Normalize each channel
mean = img.mean(axis=(0, 1))
std = img.std(axis=(0, 1))

normalized = (img - mean) / std

# 5. Convert to grayscale using broadcasting
weights = np.array([0.299, 0.587, 0.114])
gray = np.sum(img * weights, axis=2).astype(np.uint8)

# 6. Create a color tint
tint = np.array([1.0, 0.8, 0.7])
tinted = np.clip(img * tint, 0, 255).astype(np.uint8)

# 7. Threshold
binary = np.where(gray > 128, 255, 0).astype(np.uint8)

Image.fromarray(bright).save("brightness.jpg")
Image.fromarray(adjusted).save("channel_brightness.jpg")
Image.fromarray(contrast).save("channel_contrast.jpg")
Image.fromarray(gray).save("grayscale.jpg")
Image.fromarray(tinted).save("tinted.jpg")
Image.fromarray(binary).save("threshold.jpg")