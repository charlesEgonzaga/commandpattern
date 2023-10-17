## Programming Challenge

Design a system that uses a special remote control to send commands to different devices. The key idea is to create a way for the remote control to control multiple devices without knowing the specifics of each device. Specifically:

Create a remote control that can send commands like "Power On" and "Power Off."

Implement separate commands for "Turn On" and "Turn Off."

Develop a system where devices (e.g., TV, stereo, lights) can respond to these commands. Each device should have its unique behavior for turning on and off.

Ensure that the remote control can send these commands to any device without knowing how each device works internally.

Your challenge is to apply a design pattern that allows this remote control to be flexible and extensible, enabling it to control various devices effortlessly. This should be achieved without the remote control having to understand the specific details of how each device operates.

## Updated Class Diagram

![CommandPattern(Updated)](https://github.com/charlesEgonzaga/commandpattern/assets/142955651/965f16a7-c8bb-46ad-b0d5-6d41b173f6b3)
