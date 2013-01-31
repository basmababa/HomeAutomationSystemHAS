
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">


<%@ page import="java.sql.*" %>
<%@ page import="com.sun.jna.Native"%>
<%@ page import="com.sun.jna.NativeLibrary"%>
<%@ page import="java.awt.BorderLayout"%>
<%@ page import="java.awt.Canvas"%>
<%@ page import="javax.swing.ImageIcon"%>
<%@ page import="javax.swing.JFrame"%>
<%@ page import="java.awt.Color"%>
<%@ page import="javax.swing.JPanel"%>
<%@ page import="uk.co.caprica.vlcj.binding.LibVlc"%>
<%@ page import="uk.co.caprica.vlcj.player.MediaPlayerFactory"%>
<%@ page import="uk.co.caprica.vlcj.player.embedded.EmbeddedMediaPlayer"%>
<%@ page import="uk.co.caprica.vlcj.player.embedded.videosurface.CanvasVideoSurface"%>
<%@ page import="uk.co.caprica.vlcj.runtime.RuntimeUtil"%>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
    <body background="mechanical_ladybird-1280x1024.jpg">

        <%
                    JFrame frame;
                    JPanel contentPane;
                    Canvas canvas;
                    MediaPlayerFactory factory;
                    EmbeddedMediaPlayer mediaPlayer;
                    CanvasVideoSurface videoSurface;
                    String mrl = "dshow://";
                    canvas = new Canvas();
                    canvas.setBackground(Color.black);

                    contentPane = new JPanel();
                    contentPane.setBackground(Color.black);
                    contentPane.setLayout(new BorderLayout());
                    contentPane.add(canvas, BorderLayout.CENTER);
                    NativeLibrary.addSearchPath(RuntimeUtil.getLibVlcLibraryName(), "C:\\Program Files (x86)\\VideoLAN\\VLC");
                    Native.loadLibrary(RuntimeUtil.getLibVlcLibraryName(), LibVlc.class);
                    frame = new JFrame("Capture");
                    // frame.setIconImage(new ImageIcon(getClass().getResource("/icons/vlcj-logo.png")).getImage());
                    frame.setContentPane(contentPane);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setLocation(50, 50);
                    frame.setSize(800, 600);

                    factory = new MediaPlayerFactory("--no-video-title-show");
                    mediaPlayer = factory.newEmbeddedMediaPlayer();

                    videoSurface = factory.newVideoSurface(canvas);

                    mediaPlayer.setVideoSurface(videoSurface);
                    frame.setVisible(true);
                    mediaPlayer.playMedia(mrl);
        %>
    </body>
</html>
