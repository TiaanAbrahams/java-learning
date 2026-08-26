import 'package:flutter/material.dart';

void main() {
  runApp(const CareApp()); // Starts the app
}

// Root of the app
class CareApp extends StatelessWidget {
  const CareApp({super.key});

  @override
  Widget build(BuildContext context) {
    return const MaterialApp(
      debugShowCheckedModeBanner: false, // removes debug banner
      home: PatientScreen(), // first screen shown
    );
  }
}

class PatientScreen extends StatefulWidget {
  const PatientScreen({super.key});

  @override
  State<PatientScreen> createState() => _PatientScreenState();
}

class _PatientScreenState extends State<PatientScreen> {
  double progress = 0.0;
  bool isHolding = false;

  void startLoading() async {
    isHolding = true;
    progress = 0.0;

    while (progress < 1.0 && isHolding) {
      await Future.delayed(const Duration(milliseconds: 50));
      setState(() {
        progress += 0.05;
      });
    }

    if (progress >= 1.0) {
      print("Emergency triggered");
    }
  }

  void stopLoading() {
    isHolding = false;
    setState(() {
      progress = 0.0;
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Colors.black,

      body: Center(
        child: GestureDetector(
          onLongPressStart: (_) => startLoading(),
          onLongPressEnd: (_) => stopLoading(),

          child: Stack(
            alignment: Alignment.center,
            children: [
              // Ring (progress)
              SizedBox(
                width: 220,
                height: 220,
                child: CircularProgressIndicator(
                  value: progress,
                  strokeWidth: 6,
                  color: Colors.red,
                ),
              ),

              // Button
              Container(
                width: 200,
                height: 200,
                decoration: BoxDecoration(
                  color: Colors.red,
                  borderRadius: BorderRadius.circular(100),
                ),
                child: const Center(
                  child: Text(
                    "Emergency",
                    style: TextStyle(
                      color: Colors.white,
                      fontSize: 35,
                      fontWeight: FontWeight.bold,
                    ),
                  ),
                ),
              ),
            ],
          ),
        ),
      ),
    );
  }
}
