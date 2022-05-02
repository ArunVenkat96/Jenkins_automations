FROM rhel:1.0
EXPOSE 22
RUN apt-get openssh-server
CMD ["/bin/bash","whoami"]
 
